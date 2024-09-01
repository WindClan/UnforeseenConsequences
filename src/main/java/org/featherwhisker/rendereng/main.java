package org.featherwhisker.rendereng;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main implements ModInitializer {
    public static Logger log = LoggerFactory.getLogger("rendereng");
    public static boolean shouldConvertShaders = true;
    public static String shaderVersion = "300 es";
    @Override
    public void onInitialize() {

    }

    public static String convertShader(String str,int i) {
        String append = "precision lowp float;";
        return (str
                .replaceAll("#version 150","#version "+shaderVersion+"\n"+append)
                .replaceAll("texCoord2 = UV2;","texCoord2 = vec2(UV2);")
        );
    }
}
