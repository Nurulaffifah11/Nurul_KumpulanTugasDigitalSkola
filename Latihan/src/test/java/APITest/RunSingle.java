package APITest;

import com.intuit.karate.junit5.Karate;

public class RunSingle {
    @Karate.Test
//    public Karate postRun() {
//        return Karate.run("postRequest").relativeTo(getClass());
//    }

//    public Karate getRun() {
//        return Karate.run("getRequest").relativeTo(getClass());
//    }

    public Karate delRun(){
        return Karate.run("delRequest").relativeTo(getClass());
 }
}
