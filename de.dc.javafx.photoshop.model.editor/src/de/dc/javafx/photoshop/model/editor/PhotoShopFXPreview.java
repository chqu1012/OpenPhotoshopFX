package de.dc.javafx.photoshop.model.editor;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.dc.javafx.photoshop.model.NodeFX;
import de.dc.javafx.photoshop.model.NodeFactory;
import de.dc.javafx.photoshop.model.PhotoShopFX;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class PhotoShopFXPreview extends ViewPart implements ISelectionListener {

	private FXCanvas fxCanvas;
	private Pane pane = new Pane();
	private NodeFactory factory = new NodeFactory();
	
	@Override
	public void createPartControl(Composite parent) {
		fxCanvas = new FXCanvas(parent, SWT.NONE);
		fxCanvas.setScene(new Scene(pane));
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		fxCanvas.forceFocus();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		pane.getChildren().clear();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.getFirstElement() instanceof NodeFX) {
				NodeFX o = (NodeFX) ss.getFirstElement();
				Node node = factory.doSwitch(o);
				if (node!=null) {
					pane.getChildren().add(node);
				}
			}else if (ss.getFirstElement() instanceof PhotoShopFX) {
				PhotoShopFX o = (PhotoShopFX) ss.getFirstElement();
				Node node = factory.doSwitch(o);
				if (node!=null) {
					pane.getChildren().add(node);
				}
			}
	    }
	}

}
