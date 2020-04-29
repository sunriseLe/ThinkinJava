package package3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Map<String,Gerbil> map=new HashMap<>();
        map.put("little1",new Gerbil("little1"));
        map.put("little2",new Gerbil("little2"));
        map.put("little3",new Gerbil("little3"));
        map.put("little4",new Gerbil("little4"));
        map.put("little5",new Gerbil("little5"));
        Iterator<String> keyIterator=map.keySet().iterator();
        while (keyIterator.hasNext()){
            String key=keyIterator.next();
            System.out.print(key+": ");
            map.get(key).hop();
        }*/
        /*Map<String, Gerbil> map = new HashMap<>();
        map.put("Fuzzy", new Gerbil("Fuzzy"));
        map.put("Stanford", new Gerbil("Stanford"));
        map.put("Alice", new Gerbil("Alice"));
        map.put("California", new Gerbil("California"));
        map.put("Weston", new Gerbil("Weston"));
        map.put("Mongo", new Gerbil("Mongo"));
        System.out.println(map);
        Set<String> set = new TreeSet<>(map.keySet());
        System.out.println("Sorted Key: " + set);
        Map<String,Gerbil> sortedMap=new LinkedHashMap<>();
        for (String key:set){
            sortedMap.put(key,map.get(key));
        }
        System.out.println(sortedMap);*/
        /*Map<Character, Integer> map = totalCount(readFile());
        System.out.println(map);*/
        /*wordCount(readFile());*/
        /*useWorldCount(readFile());*/
        /*randomNumber();*/
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("lucy",24);
        map.put("john",23);
        map.put("grace",21);
        map.put("alice",18);
        map.put("cindy",25);
        List<String> list=new ArrayList<>();
        list.addAll(map.keySet());
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String string:list){
            int count=map.get(string);
            map.remove(string);
            map.put(string,count);
        }
        System.out.println(map);
    }

    public static void randomNumber(){
        Random random=new Random();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<10000;i++){
            int item=random.nextInt(50);
            map.put(item,map.getOrDefault(item,0)+1);
        }
        int max=-1;
        int maxValue=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (max<entry.getValue()){
                max=entry.getValue();
                maxValue=entry.getKey();
            }
            System.out.print(entry+" ");
        }
        System.out.println(map);
        System.out.println(maxValue+": "+max);
    }
    public static void useWorldCount(List<String> contents) {
        List<String> form = new ArrayList<>();
        for (String string : contents) {
            form.addAll(Arrays.asList(string.split(" ")));
        }
        Collections.sort(form, String.CASE_INSENSITIVE_ORDER);
        Set<String> set1 = new HashSet<>();
        Set<WordCount> set2 = new LinkedHashSet<>();
        for (String string : form) {
            if (!set1.contains(string)) {
                set1.add(string);
                int count = 0;
                for (int i = 0; i < form.size(); i++) {
                    if (form.get(i).equals(string)) {
                        count++;
                    }
                }
                set2.add(new WordCount(string, count));
            }
        }
        System.out.println(set2);
    }

    public static void wordCount(List<String> contents) {
        List<String> list = new ArrayList<>();
        for (String string : contents) {
            String[] strings = string.split(" ");
            Collections.addAll(list, strings);
        }
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String string : list) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        System.out.println(map);
    }

    public static Map<Character, Integer> totalCount(List<String> contents) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> map = new HashMap<>();
        for (String str : contents) {
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (set.contains(arr[i])) {
                    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                }
            }
        }
        return map;
    }

    public static List<String> readFile() {
        List<String> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("Test.");
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                list.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

class WordCount {
    private String word;
    private int count;

    WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }
    public String toString(){
        return word+": "+count;
    }
}


class Gerbil {
    private String name;

    public Gerbil(String name) {
        this.name = name;
    }

    public void hop() {
        System.out.println("Gerbil " + name + " jumping");
    }
}