package com.sternkn.jpuzzle.engine;

public class Canvas
{
   private int width;
   private int height;
   private PointState[][] canvas;
   
   public Canvas(int width, int height)
   {
      if (width <= 0) throw new IllegalArgumentException("Width should be > 0 (width = " + width + ")");
      if (height <= 0) throw new IllegalArgumentException("Height should be > 0 (height = " + height + ")");
      
      this.width = width;
      this.height = height;
      canvas = new PointState[height][width];
      
      for (int row = 0; row < height; row++)
      {
         for (int column = 0; column < width; column++)
         {
            canvas[row][column] = PointState.UNKNOWN;
         }
      }
   }
}
