package com.mydesign.Iterator.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/12 0:03
 * @Desc：
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
