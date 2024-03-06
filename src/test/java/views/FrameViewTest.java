package views;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrameViewTest {

	private FrameFixture window;

    @BeforeClass
    public static void setUpOnce() {
      FailOnThreadViolationRepaintManager.install();
    }
    
    @BeforeEach
    public void setUp() {
    	FrameView frame = GuiActionRunner.execute(() -> new FrameView());
        window = new FrameFixture(frame);
        window.show();
    }

    @AfterEach
    public void tearDown() {
        window.cleanUp();
    }
    
    @Test
    public void checkFrameViewAddItem() {
    	
    }
    
    @Test
    public void checkFrameViewDeleteItem() {
    	
    }
    
    @Test
    public void checkFrameViewAddAndUndoItem() {
    	
    }
    
    @Test
    public void checkFrameViewDeleteAndUndoItem() {
    	
    }
    
    @Test
    public void checkFrameViewSpanishToEnglish() {
    	
    }
    
    @Test
    public void checkFrameViewSDialogStatisticsOpens() {
    	
    }
}
