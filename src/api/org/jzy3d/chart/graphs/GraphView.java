package org.jzy3d.chart.graphs;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import org.jzy3d.chart.ChartView;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Scene;

public class GraphView extends ChartView {
	public GraphView(Scene scene, ICanvas canvas, Quality quality) {
		super(scene, canvas, quality);
	}
	
	public Coord3d projectMouse(int x, int y) {
		return cam.screenToModel(getCurrentGL(), glu, new Coord3d((float)x,(float)y,0));
	}

	protected void correctCameraPositionForIncludingTextLabels(GL2 gl, GLU glu, float left, float right) {
        /*cam.setViewPort(canvas.getRendererWidth(), canvas.getRendererHeight(), left, right);
        cam.shoot(gl, glu, cameraMode);
        axe.draw(gl, glu, cam);
        clear(gl);

        AxeBox abox = (AxeBox)axe;
        BoundingBox3d newBounds = abox.getWholeBounds().scale(scaling);

        if (viewmode == CameraMode.TOP){
        	float radius = Math.max(newBounds.getXmax() - newBounds.getXmin(), newBounds.getYmax() - newBounds.getYmin()) / 2;
            radius += (radius * STRETCH_RATIO);
        	cam.setRenderingSphereRadius(radius);
        }else
            cam.setRenderingSphereRadius((float) newBounds.getRadius());

        Coord3d target = newBounds.getCenter();
        Coord3d eye = viewpoint.cartesian().add(target);
        cam.setTarget(target);
        cam.setEye(eye);*/
    }
	
	protected GLU glu = new GLU();
}
