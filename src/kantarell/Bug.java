/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantarell;

import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class Bug 
{
    private String title;
    private String description;
    private String str; // steps to reproduce
    private Priority priority;
    private Severity severity;
    private boolean fixed = false;
    private ArrayList<String> comments = new ArrayList<>();
}
