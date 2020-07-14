/*
map扩展知识
map集合被使用是因为具备映射关系

一个学校有多个教室，每个教室有多个学生

 */

package Day16;

import java.util.*;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, List<Teacher>> jiaoshi = new HashMap<>();

        List <Teacher> yure = new ArrayList<>();
        List <Teacher> jiuye = new ArrayList<>();

        jiaoshi.put("yure",yure);
        jiaoshi.put("jiuye",jiuye);

        yure.add(new Teacher("03", "张三"));
        yure.add(new Teacher("04", "李四"));
        jiuye.add(new Teacher("05", "王五"));
        jiuye.add(new Teacher("06", "赵六"));


        //遍历jiaoshi集合，获取所有的教室
        Set<String> keySet = jiaoshi.keySet();
        Iterator<String> it = keySet
                .iterator();
        while (it.hasNext()) {
            String roomName = it.next();
            List<Teacher> room = jiaoshi.get(roomName);
            System.out.println(roomName);
            getInfo(room);

        }


    }

    public static void getInfo(List<Teacher> list) {

        Iterator<Teacher> it = list.iterator();

        while (it.hasNext()) {
            Teacher t = it.next();
            System.out.println(t);
        }
    }

}

class Teacher {
    String id;
    String name;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "..." + name;
    }

}


