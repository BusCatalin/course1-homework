package ro.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;

public class MainProject {
    public static void main(String[] args) {
        Project project= new Project("Research",23,new ArrayList<Category>(List.of(Category.FOOD,Category.ELECTRONICS)),"Research food waste");
        System.out.println(project);
//        project.getCategories().set(1,Category.CLOTHES);
        List<Category> categoryList= project.getCategories();
        System.out.println(categoryList);
        System.out.println(project.getDescription());

        System.out.println("--------");
        List<Category> myCategories = List.of(Category.DYI,Category.CLOTHES );
        System.out.println(myCategories);
        Project project1= new Project("Random",33,myCategories,"-");
//        myCategories.set(1,Category.DYI);
        System.out.println(project1);
        project1.addCategory(Category.ELECTRONICS);
        System.out.println(project1);

    }
}
