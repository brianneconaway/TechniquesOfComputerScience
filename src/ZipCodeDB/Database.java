package ZipCodeDB;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Store data about all zipcodes
 */
public class Database implements LatLngInterface {

    private ArrayList<Zipcode> codes;

    public Database() {
        // allocate the array list
        this.codes = new ArrayList<>();
        this.load_zips();

    }

    // fill the zipcode array list with real data
    private void load_zips() {
        // connect to the webpage of speeds
        URL url = null; // null is the nothing value, None from python
        Scanner s = null;

        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt"); // create a URl object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //read zipcode file line by line
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] parts = line.split(",");
            Zipcode z = new Zipcode(
                    parts[1].substring(1, parts[1].length() - 1),
                    parts[2].substring(1, parts[2].length() - 1),
                    parts[3].substring(1, parts[3].length() - 1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]),
                    Integer.parseInt(parts[6])
            );

            codes.add(z); //put z at the end of the array list
        }//while

        //sort by the zipcode, want to binary search, so we aren't linear searching
        Collections.sort(this.codes);

    } // load_zips


    // write a function to search for zipcode data by a zipcode
    // return the reference to the object if found
    // null not found
    public Zipcode findByZip(String code) {
        for (int i = 0; i < this.codes.size(); i++) {
            if (code.equals(this.codes.get(i).getCode()))
                return this.codes.get(i);
        }
        return null;
    }

    public Zipcode findByZip1(String code) {
        for (Zipcode zipcode : this.codes) {
            if (code.equals(zipcode.getCode()))
                return zipcode;
        }
        return null;
    }

    private Zipcode bsearch(String target, int low, int high) {

        if (low > high)
            return null;

        int mid = (low + high) / 2;
        if (this.codes.get(mid).getCode().equals(target))
            return this.codes.get(mid);
        else if (this.codes.get(mid).getCode().compareTo(target) < 0)
            return bsearch(target, mid + 1, high);
        else
            return bsearch(target, low, mid - 1); //recursion (a function that calls itself)
    }

    //provides a simpler interface to the bsearch function
    public Zipcode search(String code) {
        //return bsearch(code, 0, codes.size()-1);
        int pos = Collections.binarySearch(this.codes, new Zipcode(code, "", "", 0, 0, 0));

        if (pos != -1)
            return this.codes.get(pos);
        else
            return null;
    }

    public Zipcode getNorthern() {
        int lat = 0;

        for (int i = 0; i < this.codes.size(); i++) { // I think this is the i it is using instead of the lat i
            int pos = Collections.binarySearch(this.codes, new Zipcode("", "", "", 0,
                    Math.abs(i), 0));
        // made it positive and it still hates me
            if (pos > lat)
                lat += i;
        }
       return this.codes.get(lat); //how do you even get an out-of-bounds error for an array that expands????

        // I feel like I'm so close, but im not sure what else to try
    }

    @Override
    public double latlnginterface(Database lat) {
        return 0;
    }
}

