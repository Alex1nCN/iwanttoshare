package slist;

public class MyList {
    protected int maxsize;
    protected int length=0;
    protected int[] number;
    protected String[] name;
    protected int[] scores;

    public MyList(int maxsize){
        this.maxsize=maxsize;
        this.number=new int[maxsize];
        this.name=new String[maxsize];
        this.scores=new int[maxsize];
    }

    public void add(int index,int number,String name,int score){
        if(length==maxsize){
            System.out.println("顺序表已满！！！");
            return;
        }
        if(index==length){
            length++;
            this.number[index]=number;
            this.name[index]=name;
            this.scores[index]=score;
        }else if(index<=0||index>length){
            System.out.println("not valid!!!");
        }else{
            length++;
            for(int i=length-1;i>index;i--){
                this.number[i]=this.number[i-1];
                this.name[i]=this.name[i-1];
                this.scores[i]=this.scores[i-1];
            }
            this.number[index]=number;
            this.name[index]=name;
            this.scores[index]=score;
        }
    }

    public void add(int number,String name,int score){
        int index=length;
        if(length==maxsize){
            System.out.println("顺序表已满！！！");
            return;
        }
        if(index==length){
            length++;
            this.number[index]=number;
            this.name[index]=name;
            this.scores[index]=score;
        }else if(index<=0||index>length){
            System.out.println("not valid!!!");
        }else{
            length++;
            for(int i=length-1;i>index;i--){
                this.number[i]=this.number[i-1];
                this.name[i]=this.name[i-1];
                this.scores[i]=this.scores[i-1];
            }
            this.number[index]=number;
            this.name[index]=name;
            this.scores[index]=score;
        }
    }

    public void Myprint(){
        for(int i=0;i<length;i++){
            System.out.println(this.number[i]+"\t"+this.name[i]+"\t"+this.scores[i]);
        }
    }

    public void del(int index){
        if(length==0){
            System.out.println("顺序表是空哒！！！");
            return;
        }
        if(index<=0||index>length-1){
            System.out.println("not valid!!!");
        }else{
            length--;
            for(int i=index;i<=length-1;i++){
                this.number[i]=this.number[i+1];
                this.name[i]=this.name[i+1];
                this.scores[i]=this.scores[i+1];
            }
        }
    }

    public void sort(boolean reverse){
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if((this.scores[j]>this.scores[i])==reverse){
                    int temp=scores[i];
                    scores[i]=scores[j];
                    scores[j]=temp;
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                    String s=name[i];
                    name[i]=name[j];
                    name[j]=s;
                }
            }
        }
    }

    public static void main(String[] args) {
        MyList l=new MyList(100);
        l.add(101,"小明",70);
        l.add(201,"小红",80);
        l.add(203,"小李",60);
        l.add(301,"小白",90);
        l.sort(true);
        l.Myprint();
    }
}
