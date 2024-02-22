package ItisCuneo.backend;

import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.time.LocalDate;

public class CespitiFile implements IExports {


    @Override
    public void scriviCsv() {
        File fileCsv = new File(PATH + NAME_CSV);
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(fileCsv);
            bw = new BufferedWriter(fw);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void scriviJson() {

    }
}