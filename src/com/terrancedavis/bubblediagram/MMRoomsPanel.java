package com.terrancedavis.bubblediagram;

import com.terrancedavis.bubblediagram.tg.graphlayout.TGException;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MMRoomsPanel extends AdvancedBubbleDiagram
{
  public MMRoomsPanel()
  {
    super();

    final Frame frame;
    frame = new Frame("Mymud Rooms and Areas");
    frame.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        frame.dispose();
        System.exit(0);
      }
    });
    frame.add("Center", this);
    frame.setSize(800, 600);
    frame.setVisible(true);
  }

  public void initialize()
  {
    System.out.println("Hit this one");

    buildPanel();
    buildLens();
    tgPanel.setLensSet(tgLensSet);
    addUIs();
    //tgPanel.addNode();  //Add a starting node.

    try
    {
      randomGraph();
    }
    catch (TGException e)
    {
      e.printStackTrace();
    }
  }


  public static void main(String[] args)
  {
    EventQueue.invokeLater(()->{
      new MMRoomsPanel();
    });
  }

}

