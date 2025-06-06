public void addLast(int x){
    IntNode p = first;

    while(p.next != null){
        p = p.next;
    }

    p.next = new IntNode(x,null)
}

private static int size(IntNode p){
    if(p.next == null){
        return 1;
    }

    return 1 + size(p.next);
}


public class SLList{
    private IntNode first;
    private int size;

    public SLList(int x){
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
        size += 1;
    }

    public int size(){
        return size;
    }
}


public static String longest(SLList<String> list){
    int maxDex = 0
    for(int i = 0; i < list.size(); i ++){
        String longestString = list.get(maxDex);
        String thisString = list.get(i);
        if(thisString.length() > longestString.length()){
            maxDex = i;
        }
    }
    return list.get(maxDex);
}

