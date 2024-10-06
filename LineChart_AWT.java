package org.example;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart_AWT extends ApplicationFrame {

    public LineChart_AWT( String applicationTitle , String chartTitle ) {
        super(applicationTitle);
        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                "Years","Number of Schools",
                createDataset(),
                PlotOrientation.VERTICAL,
                true,true,false);

        ChartPanel chartPanel = new ChartPanel( lineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }


    private DefaultCategoryDataset createDataset( ) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        int [] my_list  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for( int number : my_list) {
            number = number^2;
        }

        dataset.addValue( 1 , "schools" , "1" );
        dataset.addValue( 4 , "schools" , "2" );
        dataset.addValue( 9, "schools" ,  "3" );
        dataset.addValue( 16 , "schools" , "4" );
        dataset.addValue( 25 , "schools" , "5" );
        dataset.addValue( 36, "schools" , "6" );
        return dataset;
    }
    public static void main( String[ ] args ) {
        LineChart_AWT chart = new LineChart_AWT(
                "Time Vs Watts" ,
                "Numer of Schools vs years");


        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }
}