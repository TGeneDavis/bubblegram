package com.terrancedavis.bubblediagram;

import java.awt.*;

public interface EdgePainter
{
  /**
   *
   * Draw horizontal arrow starting in (0, 0)
   * any shape of arrow could go here, such as ...
   *
   * final int ARR_SIZE = 4;
   * g2d.drawLine(0, 0, len, 0);
   * g2d.fillPolygon(new int[] {len, len-ARR_SIZE, len-ARR_SIZE, len},
   *     new int[] {0, -ARR_SIZE, ARR_SIZE, 0}, 4);
   *
   *  would be your traditional arrow
   *
   *
   * @param g2d Graphics context that is already rotated and transformed
   * @param len Length from node to second node
   */
  public void drawEdge(Graphics2D g2d, int len);
}
