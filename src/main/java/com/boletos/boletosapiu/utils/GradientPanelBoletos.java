/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boletos.boletosapiu.utils;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
/**
 *
 * @author josef
 */
public class GradientPanelBoletos extends JPanel{
    private final Color color1;
    private final Color color2;

    // Constructor: recibe 2 colores
    public GradientPanelBoletos(Color c1, Color c2) {
        this.color1 = c1;
        this.color2 = c2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // 🔹 Degradado horizontal
        GradientPaint gp = new GradientPaint(0, 0, color1, width, 0, color2);

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

}
