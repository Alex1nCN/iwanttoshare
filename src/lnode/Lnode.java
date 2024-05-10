package lnode;

import java.util.Scanner;

public class Lnode{
    protected int info;
    protected Lnode next;

    public Lnode(int info,Lnode next) {
        this.info=info;
        this.next=next;
    }
    public Lnode(int info) {
        this.info=info;
        this.next=null;
    }

    public void add(int newinfo){
        Lnode newl=new Lnode(newinfo);
        if(this.next==null){
            this.next=newl;
        }else{
            this.next.add(newinfo);
        }
    }

    public void Myprint(){
        System.out.print(this.info);
        if(this.next!=null){
            System.out.print("-->");
            this.next.Myprint();
        }
    }

    public void f(int n){
        int[] s1=new int[n];
        int[] s2=new int[n];
        Lnode temp=this;
        for(int i=0;temp!=null;i++,temp=temp.next){
            s1[i]=temp.info;
            s2[s2.length-i-1]=temp.info;
        }
        int i=0;
        for(i=0;i<s1.length;i++){
            if(s1[i]==s2[i]){
                continue;
            }else{
                break;
            }
        }
        if(i==s1.length){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Lnode l=new Lnode(0);
        String[] a=in.next().split(",");
        int[] a1=new int[a.length];
        for(int i=0;i<a.length;i++){
            a1[i] = Integer.parseInt(a[i]);
        }
        for(int i=0;i<a.length;i++){
            l.add(a1[i]);
        }
        l=l.next;
        l.f(a.length);
    }
}

