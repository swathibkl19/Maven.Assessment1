package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String   name;
   ArrayList<Pet> pets;
//private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        //this.pets =pets;

        if (pets != null) {
            this.pets = new ArrayList<Pet>(Arrays.asList(pets));
            for (Pet pet : pets) {
                //this.pets.add(pet);
                pet.setOwner(this);
            }
        } else this.pets = new ArrayList<Pet>();

    }


    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
       // if(pets!=null) {
            pets.add(pet);

        /**
         * Pet[] newPets =Arrays.copyOf(pets,pets.length+1);
         * newPets[newPets.length-1
         */
    }



    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

            pets.remove(pet);
            //pet.owner = this;

        }



    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return pets.contains(pet) ;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet youngestPet = pets.get(0);
        for(int i=0;i<pets.size();i++){
            Pet currentPet = pets.get(i);
        //for (Pet currentPet : pets) {
            if (currentPet.getAge() < youngestPet.getAge())
                youngestPet = currentPet;
            }
               return  youngestPet.getAge();
            }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
int i;
Pet currentPet;
        Pet oldestPet = pets.get(0);
        for( i=0;i<pets.size();i++){
             currentPet =pets.get(i);
        //for (Pet currentPet : pets) {
            if (currentPet.getAge() > oldestPet.getAge())
                oldestPet = currentPet;
            }

        return oldestPet.getAge();

//return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float total = 0;

        for(Pet currentPet : pets) {
            total += currentPet.getAge();
        }
        return total/pets.size();
        //return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {


        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if (pets.size() > 0) {
            return pets.toArray(new Pet[0]);
        } else {
            return new Pet[1];
        }
    }
}
