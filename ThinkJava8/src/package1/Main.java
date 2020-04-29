package package1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*UseQueue useQueue = new UseQueue();
        useQueue.addElement(new Command("add"));
        useQueue.addElement(new Command("sub"));
        useQueue.addElement(new Command("mul"));
        useQueue.addElement(new Command("div"));
        useQueue.addElement(new Command("mod"));
        useQueue.addElement(new Command("and"));
        useQueue.offer();*/
        /*Random random=new Random();
        PriorityQueue<Double> queue=new PriorityQueue<>();
        for (int i=0;i<15;i++){
            queue.offer(random.nextDouble()*100);
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        System.out.print("\n");*/
        /*Random random=new Random();
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i=0;i<15;i++){
            queue.offer(random.nextInt(30));
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        System.out.print("\n");*/
        CollectionSequence test=new CollectionSequence();
        Iterator<Integer> iterator=test.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.print("\n");
    }
}

class CollectionSequence implements Collection<Integer> {
    Integer[] arr = {2, 4, 7, 9, 1, 23, 34, 10};

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof Integer) {
            for (Integer integer : arr) {
                if (o == integer) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public Integer next() {
                return arr[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return arr;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        arr=null;
    }
}

class Command {
    private String command;

    public Command(String command) {
        this.command = command;
    }

    public void operation() {
        System.out.println(command);
    }
}

class MyQueue {
    Queue<Command> queue = new LinkedList<>();

    public Command offer(Command command) {
        boolean flag = queue.offer(command);
        if (flag) {
            return command;
        }
        return null;
    }
}

class UseQueue {
    private MyQueue myQueue = new MyQueue();

    public void addElement(Command command) {
        myQueue.offer(command);
    }

    public void offer() {
        while (!myQueue.queue.isEmpty()) {
            Command command = myQueue.queue.poll();
            command.operation();
        }
    }
}

