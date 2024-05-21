package org.pwjcw.StaticProxy;

import org.pwjcw.Hello;
import sun.dc.pr.PRError;

public class XiaoMing implements Hello {
    private Persion persion;


    public XiaoMing(Persion persion){
        this.persion=persion;

    }
    @Override
    public void Say(String name) {
        System.out.println("Say执行前的操作");
        persion.Say(name);
        System.out.println("Say执行后的操作");
    }
}
