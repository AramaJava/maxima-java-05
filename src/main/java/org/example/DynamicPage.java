package org.example;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class DynamicPage {

    public static void createPage(String filename) throws TemplateException, IOException {
        String resPath = App.class.getClassLoader().getResource(filename).getPath();

        FileWriter writer = new FileWriter("result.html", false);


        Configuration config = new Configuration(Configuration.VERSION_2_3_31);
        config.setDirectoryForTemplateLoading(new File(resPath));
        config.setDefaultEncoding("UTF-8");

        Map<String, Object> root = new HashMap<>();
        root.put("title", "Список котов");

        Cat cat1 = new Cat("Мурзик", 10, true);
        Cat cat2 = new Cat("Барсик", 7, true);
        Cat cat3 = new Cat("Маруся", 5, true);

        root.put("cat1", cat1);
        root.put("cat2", cat2);
        root.put("cat3", cat3);

        Template template = config.getTemplate("index.html");
        template.process(root, writer);

        writer.flush();
        writer.close();

    }
}
