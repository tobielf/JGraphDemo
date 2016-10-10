package com.mxgraph.examples.swing;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class PLPVisualizer extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2707712944901661771L;

	public PLPVisualizer()
	{
		super("PLP Visualizer");

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try
		{
			Object pc = graph.insertVertex(parent, null, "PC", 40, 280, 20,
					60);
			Object add1 = graph.insertVertex(parent, null, "Add", 120, 20,
					60, 80);
			Object instruction_memory = graph.insertVertex(parent, null, "IM",
					120, 300, 60, 80);
			Object shift1 = graph.insertVertex(parent, null, "Shift left 2",
					260, 40, 20, 40);
			Object control = graph.insertVertex(parent, null, "Control",
					280, 140, 60, 120);
			Object mux1 = graph.insertVertex(parent, null, "Mux",
					290, 340, 20, 40);
			Object registers = graph.insertVertex(parent, null, "Registers",
					320, 280, 80, 120);
			Object sign_extend =graph.insertVertex(parent, null, "Sign-extend",
					340, 420, 40, 60);
			Object shift2 = graph.insertVertex(parent, null, "Shift left 2",
					460, 130, 20, 40);
			Object mux2 = graph.insertVertex(parent, null, "Mux",
					460, 340, 20, 40);
			Object alu_control = graph.insertVertex(parent, null, "ALU Control",
					480, 420, 40, 60);
			Object add2 = graph.insertVertex(parent, null, "Add",
					500, 90, 60, 80);
			Object alu = graph.insertVertex(parent, null, "ALU",
					500, 300, 60, 80);
			Object mux3 = graph.insertVertex(parent, null, "Mux",
					580, 70, 20, 40);
			Object mux4 = graph.insertVertex(parent, null, "Mux",
					620, 40, 20, 40);
			Object and_gate = graph.insertVertex(parent, null, "",
					560, 220, 20, 20);
			Object data_memory = graph.insertVertex(parent, null, "Data memory",
					580, 320, 60, 90);
			Object mux5 = graph.insertVertex(parent, null, "Mux",
					660, 340, 20, 40);

			graph.insertEdge(parent, null, "", pc, add1, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.3;exitPerimeter=1;entryX=0;entryY=0.3;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", pc, instruction_memory, "exitX=1;exitY=0.7;exitPerimeter=1;"
					+ "entryX=0;entryY=0.3;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", instruction_memory, shift1, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.1;exitPerimeter=1;entryX=0;entryY=0.3;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", add1, add2, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.8;exitPerimeter=1;entryX=0;entryY=0.3;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", instruction_memory, control, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.2;exitPerimeter=1;entryX=0;entryY=0.3;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", instruction_memory, registers, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.3;exitPerimeter=1;entryX=0;entryY=0.4;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", instruction_memory, mux1, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.7;exitPerimeter=1;entryX=0;entryY=0.4;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", instruction_memory, mux1, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.8;exitPerimeter=1;entryX=0;entryY=0.6;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", instruction_memory, sign_extend, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.9;exitPerimeter=1;entryX=0;entryY=0.3;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", control, mux1, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=0.3;exitY=1;exitPerimeter=1;entryX=0.5;entryY=0;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", mux3, mux4, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.5;exitPerimeter=1;entryX=0;entryY=0.8;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", sign_extend, shift2, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.5;exitPerimeter=1;entryX=0;entryY=0.5;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", add1, mux4, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.1;exitPerimeter=1;entryX=0;entryY=0.2;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", shift1, mux4, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.5;exitPerimeter=1;entryX=0;entryY=0.4;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", control, mux4, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.2;exitPerimeter=1;entryX=0;entryY=0.6;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", shift2, add2, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.5;exitPerimeter=1;entryX=0;entryY=0.5;entryPerimeter=1;");
			graph.insertEdge(parent, null, "", add2, mux3, "edgeStyle=elbowEdgeStyle;elbow=horizontal;"
					+ "exitX=1;exitY=0.5;exitPerimeter=1;entryX=0;entryY=0.7;entryPerimeter=1;");
		}
		finally
		{
			graph.getModel().endUpdate();
		}

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
	}

	public static void main(String[] args)
	{
		PLPVisualizer frame = new PLPVisualizer();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 500);
		frame.setVisible(true);
	}

}
