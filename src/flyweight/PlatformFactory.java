package flyweight;

import java.util.HashMap;
import java.util.Map;

public final class PlatformFactory {

    private static final Map<EPlatform, IPlatform> map = new HashMap<>();

    public PlatformFactory(){
        throw new AssertionError("Cannot instantiate the class");
    }

    public static synchronized IPlatform getPlatformInstance(EPlatform platformType){
        IPlatform platform = map.get(platformType);

        if(platform == null){
            switch (platformType) {
                case C -> platform = new CPlatform();
                case CPP -> platform = new CPPPlatform();
                case JAVA -> platform = new JavaPlatform();
                case RUBY -> platform = new RubyPlatform();
            }
            map.put(platformType, platform);
        }

        return platform;
    }

}
