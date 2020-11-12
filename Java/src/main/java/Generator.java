import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.XlsbSaveOptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Generator {
    public static void main(String[] args) throws Exception {
        Workbook wb = new Workbook();
        Worksheet ws = wb.getWorksheets().get(0);
        ws.setName("Example");
        ws.getCells().get(0, 0).setValue(true);
        ws.getCells().get(0, 1).setValue(true);
        ws.getCells().get(0, 2).setValue(false);
        ws.getCells().get(1, 0).setValue(true);
        ws.getCells().get(1, 1).setValue("#NUM!");
        ws.getCells().get(1, 2).setValue("#VALUE!");
        ws.getCells().get(2, 0).setValue("#NUM!");
        ws.getCells().get(2, 1).setValue(true);
        ws.getCells().get(2, 2).setValue(false);
        XlsbSaveOptions saveOptions = new XlsbSaveOptions();
        String envVar = System.getenv("EXPORT_ALL_COLUMN_INDEXES");
        boolean safe = "1".equals(envVar);
        System.out.print("Safe: ");
        System.out.println(safe);
        saveOptions.setExportAllColumnIndexes(safe);
        Path path = Paths.get("..", "wb-" + (safe ? "" : "un") + "safe.xlsb").normalize().toAbsolutePath();
        wb.save(path.toString(), saveOptions);
    }
}
