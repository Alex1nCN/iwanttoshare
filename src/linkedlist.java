public class linkedlist {
    protected node head;
    protected int size;

    public static class node{
        int info;
        node next;

        public node(int info){
            this.info=info;
        }
    }

    public linkedlist(){
    }

    public void add(int info){
        node temp=head;
        if(size==0){
            head=new node(info);
            size++;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new node(info);
            size++;
        }
    }

    public void print(){
        node temp = head;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }


    public void f() {
        if (head == null || head.next == null) return; // 链表为空或只有一个元素

        node[] nodes = new node[size];
        node temp = head;
        for (int i = 0; i < size; i++) {
            nodes[i] = temp;
            temp = temp.next;
        }

        // 重新链接节点
        for (int i = 0; i < size - 1; i++) {
            if (i % 2 == 0 && i < size - 2) {
                nodes[i].next = nodes[i + 2];
            } else if (i % 2 == 1 && i < size - 2) {
                nodes[i].next = nodes[i + 2];
            }
        }

        if (size % 2 == 0) {
            nodes[size - 2].next = nodes[1];
            nodes[size - 1].next = null;
        } else {
            nodes[size - 1].next = nodes[1];
            if (size > 1) {
                nodes[size - 2].next = null;
            }
        }
    }


    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.f();
        l.print();
    }
}
