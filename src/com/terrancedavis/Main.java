package com.terrancedavis;

import com.terrancedavis.bubblediagram.MMRoomsPanel;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main
{

  public static void main(String[] args)
  {
    final Frame frame;
    final MMRoomsPanel glPanel = new MMRoomsPanel();
    frame = new Frame("Mymud Rooms Navigator");
    frame.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        frame.remove(glPanel);
        frame.dispose();
      }
    });
    frame.add("Center", glPanel);
    frame.setSize(800, 600);
    frame.setVisible(true);
  }
}
