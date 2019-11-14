package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        int counter = 0;
        StringBuilder tempString = new StringBuilder();
        while ( counter < personArray.length) {
            tempString.append(personArray[counter].toString());
            counter++;
        }

        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return tempString.toString();
    }



    public String forLoop() {
        int counter = 0;

        StringBuilder tempString = new StringBuilder();

        for(int i =0 ; i < personArray.length; i ++){
            tempString.append(personArray[counter].toString());
            counter++;
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return tempString.toString();
    }



    public String forEachLoop() {
    // int counter = 0;

     StringBuilder tempString = new StringBuilder();

     for ( Person counter : personArray ) {
        tempString.append(counter.toString());

     }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return tempString.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
