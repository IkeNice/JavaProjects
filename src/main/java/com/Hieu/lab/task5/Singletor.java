// шаблоны программирования

package com.Hieu.lab.task5;

public class Singletor {
    private static Singletor instance;

    private Singletor(){}

    public static Singletor getInstance(){
        if(instance == null){
            instance = new Singletor();
        }
        return instance;
    }
    /* возможно что-то не дописано */
//    abstract class InputStream{
//        private int read() {
//            return 0;
//        }
//    }
//    public class LogTimeInputStream extends InputStream{
//        InputStream in;
//        LogTimeInputStream(InputStream in){
//            this.in = in;
//        }
//        public int read(){
//            sout(now());
//            in.read();
//            sout(now())
//        }
//    }
}
