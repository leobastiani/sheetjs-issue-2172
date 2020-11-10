import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Generator {
    public static void main(String[] args) throws Exception {
        Workbook wb = new Workbook();
        Worksheet ws = wb.getWorksheets().get(0);
        ws.setName("Example");

        // Row 1
        ws.getCells().get(0, 0).setValue("A1");
        ws.getCells().get(0, 1).setValue("B1");
        ws.getCells().get(0, 2).setValue("C1");

        // Row 2
        ws.getCells().get(1, 0).setValue("A2");
        ws.getCells().get(1, 1).setValue("B2");

        // Row 3
        ws.getCells().get(2, 0).setValue("A3");
        ws.getCells().get(2, 2).setValue("C3");

        // Row 4
        ws.getCells().get(3, 0).setValue("A4");
        ws.getCells().get(3, 1).setValue("B4");
        ws.getCells().get(3, 2).setValue(123);

        // Row 5
        ws.getCells().get(4, 0).setValue("A5");
        ws.getCells().get(4, 1).setValue(234);

        // Row 6
        ws.getCells().get(5, 0).setValue(345);
        ws.getCells().get(5, 1).setValue("B6");
        ws.getCells().get(5, 2).setValue("C6");

        Path path = Paths.get("..", "wb.xlsb").normalize().toAbsolutePath();
        wb.save(path.toString());
    }
}
