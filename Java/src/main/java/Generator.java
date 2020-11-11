import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

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
        Path path = Paths.get("..", "wb.xlsb").normalize().toAbsolutePath();
        wb.save(path.toString());
    }
}
