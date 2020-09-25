package com.eoi.pattern;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Layer1 {
    public Layer2 layer2;
}
class Layer2 {
    public List<Layer3> layer3;
}
class Layer3 {
    public Integer val;
    public List<Layer4> layer4;
}

class Layer4 {
    public String val;
    public List<List<Integer>> int2s;
    public List<List<List<Integer>>> int3s;
}

public class test {
    @Test
    public void test() {
        Layer1 layer1 = new Layer1();
        layer1.layer2 = new Layer2();
        layer1.layer2.layer3 = new ArrayList<>();
        Layer3 l3 = new Layer3();
        l3.val = 1;
        l3.layer4 = new ArrayList<>();
        Layer4 l4 = new Layer4();
        l4.val = "hello";
        l4.int2s = new ArrayList<>();
        l4.int3s = new ArrayList<>();
        l4.int2s.add(new ArrayList<Integer>() {{ add(1); add(2); add(4);}});
        List<List<Integer>> int3s = new ArrayList<>();
        int3s.add(new ArrayList<Integer>() {{ add(2); add(3);}} );
        int3s.add(new ArrayList<Integer>() {{ add(4); add(6); add(8);}});
        l4.int3s.add(int3s);

        l3.layer4.add(l4);
        layer1.layer2.layer3.add(l3);

        Layer2 layer2 = (Layer2) getPath(layer1, "layer2");
        Layer3 layer3 = (Layer3) getPath(layer1.layer2, "layer3[0]");
        Integer layer3_val = (Integer) getPath(layer1, "layer2.layer3[0].val");
        Layer4 layer4 = (Layer4) getPath(layer1, "layer2.layer3[0].layer4[0]");
        String layer4_val = (String) getPath(layer1, "layer2.layer3[0].layer4[0].val");
        Integer layer4_val_int2 = (Integer) getPath(layer1, "layer2.layer3[0].layer4[0].int2s[0][2]");
        Integer layer4_val_int3 = (Integer) getPath(layer1, "layer2.layer3[0].layer4[0].int3s[0][1][2]");
        System.out.println(layer4_val_int3);
    }

    private Object getPath(Object root, String path) {
        Class jsonClass = root.getClass();
        if (path.isEmpty()) {
            return null;
        }
        String[] paths = path.split("\\.", 2);
        try {
            String fieldName = paths[0].split("\\[", 2)[0];
            Field field = jsonClass.getDeclaredField(fieldName);
            field.setAccessible(true);

            Pattern r = Pattern.compile("\\[(\\d+)\\]");
            Matcher m = r.matcher(paths[0]);
            Object object = field.get(root);
            while (m.find()) {
                List<Object> list = (List<Object>)object;
                object = list.get(Integer.parseInt(m.group(1)));
            }
            if (paths.length == 1) {
                return object;
            } else {
                return getPath(object, paths[1]);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}