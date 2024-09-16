package Programs.OOPS.singleton;

public class SingletonClass {

    private SingletonClass(String name){
        this.name = name;
    };

    String name;

//    creating private static instance
    private static SingletonClass instance;

    static SingletonClass setInstance(String name)
    {
        if(instance==null)
        {
            instance = new SingletonClass(name);
        }

        return instance;
    }
}
