package ru.demetra.callrec.util;

import java.io.File;

/**
 * Find CallRec File and get path
 *
 * @author Vyacheslav Y.
 * @version 1.0
 *
 */

public class CallFile {


    String path;

    public String findFile(File dir, String fileName) {
        File file = new File(dir.getAbsolutePath() + "//" + fileName);


        if (file.isFile() && file.exists()) {
            path = file.getAbsolutePath();


        }
        File[] files = dir.listFiles();
        for (File f : files) {
            if (path == null) {
                System.out.println(f.toString());
                if (f.isDirectory()) {
                    findFile(f, fileName);
                }
            }
        }
        return path;
    }

    public String pathSelector(String dir, String path, String prefix) {

        if (path.contains("/")) {
            return path.replace(dir, prefix);

        } else {
            path = findFile(new File(dir), path);
            return path.replace(dir, prefix);

        }

    }
}

