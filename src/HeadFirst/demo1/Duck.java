package HeadFirst.demo1;

/**
 * @author 胡冉
 * @ClassName Duck
 * @Date 2019/5/14 17:45
 * @Version 2.0
 */
public abstract class Duck {

     public String quack(){
         System.out.println("呱呱叫");
         return "呱呱叫";
     }
    public String swim(){
        System.out.println("游泳");
        return "游泳";
    }
    public String fly(){
        return "非得更高";
    }
    /**
     * 每一种鸭子的外观不同，所有该方法是抽象的
     * @return
     */
      abstract String display();
}
