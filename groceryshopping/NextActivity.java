package com.example.groceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView name;
    TextView apple;
    TextView hamburger;
    TextView broccoli;
    TextView pizza;
    TextView orange_juice;
    TextView other;

    TextView appleQ;
    TextView hamburgerQ;
    TextView broccoliQ;
    TextView pizzaQ;
    TextView orange_juiceQ;
    TextView otherQ;

    TextView appleP;
    TextView hamburgerP;
    TextView broccoliP;
    TextView pizzaP;
    TextView orange_juiceP;
    TextView otherP;

    Button add_a;
    Button add_h;
    Button add_b;
    Button add_p;
    Button add_j;
    Button add_o;

    Button delete_a;
    Button delete_h;
    Button delete_b;
    Button delete_p;
    Button delete_j;
    Button delete_o;

    EditText item_i;
    EditText item_p;
    Button clear;
    Button calculate;

    TextView tax;
    TextView totalWithTax;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_groceriess);

        name = (TextView) findViewById (R.id.categoriesName);
        apple = (TextView) findViewById (R.id.apple);
        hamburger = (TextView) findViewById (R.id.hamburger);
        broccoli = (TextView) findViewById (R.id.broccoli);
        pizza = (TextView) findViewById (R.id.pizza);
        orange_juice = (TextView) findViewById (R.id.orange_juice);
        other = (TextView) findViewById (R.id.other_i);

        appleQ = (TextView) findViewById (R.id.apple_q);
        hamburgerQ = (TextView) findViewById (R.id.hamburger_q);
        broccoliQ = (TextView) findViewById (R.id.broccoli_q);
        pizzaQ = (TextView) findViewById (R.id.pizza_q);
        orange_juiceQ = (TextView) findViewById (R.id.orange_q);
        otherQ = (TextView) findViewById (R.id.other_q);

        appleP = (TextView) findViewById (R.id.apple_p);
        hamburgerP = (TextView) findViewById (R.id.hamburger_p);
        broccoliP = (TextView) findViewById (R.id.broccoli_p);
        pizzaP = (TextView) findViewById (R.id.pizza_p);
        orange_juiceP = (TextView) findViewById (R.id.orange_p);
        otherP = (TextView) findViewById (R.id.other_p);

        add_a = (Button) findViewById (R.id.add_a);
        add_h = (Button) findViewById (R.id.add_h);
        add_b = (Button) findViewById (R.id.add_b);
        add_p = (Button) findViewById (R.id.add_p);
        add_j = (Button) findViewById (R.id.add_j);
        add_o = (Button) findViewById (R.id.add_o);

        item_i = (EditText) findViewById (R.id.other_i);
        item_p = (EditText) findViewById (R.id.other_p);

        tax = (TextView) findViewById (R.id.tax);
        totalWithTax = (TextView) findViewById (R.id.totalwithtax);

        add_a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(appleQ.getText().toString());

                if (tempAppleQ >= 0)
                {
                    tempAppleQ = tempAppleQ + 1;
                    appleQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        add_h.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(hamburgerQ.getText().toString());

                if (tempAppleQ >= 0)
                {
                    tempAppleQ = tempAppleQ + 1;
                    hamburgerQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        add_b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(broccoliQ.getText().toString());

                if (tempAppleQ >= 0)
                {
                    tempAppleQ = tempAppleQ + 1;
                    broccoliQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        add_p.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(pizzaQ.getText().toString());

                if (tempAppleQ >= 0)
                {
                    tempAppleQ = tempAppleQ + 1;
                    pizzaQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        add_j.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(orange_juiceQ.getText().toString());

                if (tempAppleQ >= 0)
                {
                    tempAppleQ = tempAppleQ + 1;
                    orange_juiceQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        add_o.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(otherQ.getText().toString());

                if (tempAppleQ >= 0)
                {
                    tempAppleQ = tempAppleQ + 1;
                    otherQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        delete_a = (Button) findViewById (R.id.delete_a);
        delete_h = (Button) findViewById (R.id.delete_h);
        delete_b = (Button) findViewById (R.id.delete_b);
        delete_p = (Button) findViewById (R.id.delete_p);
        delete_j = (Button) findViewById (R.id.delete_j);
        delete_o = (Button) findViewById (R.id.delete_o);

        delete_a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(appleQ.getText().toString());

                if (tempAppleQ != 0)
                {
                    tempAppleQ = tempAppleQ - 1;
                    appleQ.setText(Integer.toString(tempAppleQ));
                }
            }
        });
        delete_h.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(hamburgerQ.getText().toString());

                if (tempAppleQ != 0)
                {
                    tempAppleQ = tempAppleQ - 1;
                    hamburgerQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        delete_b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(broccoliQ.getText().toString());

                if (tempAppleQ != 0)
                {
                    tempAppleQ = tempAppleQ - 1;
                    broccoliQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        delete_p.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(pizzaQ.getText().toString());

                if (tempAppleQ != 0)
                {
                    tempAppleQ = tempAppleQ - 1;
                    pizzaQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        delete_j.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(orange_juiceQ.getText().toString());

                if (tempAppleQ != 0)
                {
                    tempAppleQ = tempAppleQ - 1;
                    orange_juiceQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });
        delete_o.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempAppleQ = Integer.parseInt(otherQ.getText().toString());

                if (tempAppleQ != 0)
                {
                    tempAppleQ = tempAppleQ - 1;
                    otherQ.setText(Integer.toString(tempAppleQ));
                }

            }
        });


        clear = (Button) findViewById (R.id.clear);

        clear.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                appleQ.setText(Integer.toString(0));
                hamburgerQ.setText(Integer.toString(0));
                broccoliQ.setText(Integer.toString(0));
                pizzaQ.setText(Integer.toString(0));
                orange_juiceQ.setText(Integer.toString(0));
                otherQ.setText(Integer.toString(0));
                item_i.setText("");
                item_p.setText("");
                tax.setText("Tax - $ 0.00");
                totalWithTax.setText("Total with Tax - $ 0.00");
            }
        });


        calculate = (Button) findViewById (R.id.calculate);

        calculate.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                int tempQ = Integer.parseInt(otherQ.getText().toString());
                if (tempQ == 0)
                {
                    int numApple = Integer.parseInt(appleQ.getText().toString());
                    int numHamburger = Integer.parseInt(hamburgerQ.getText().toString ());
                    int numBroccoli = Integer.parseInt(broccoliQ.getText().toString());
                    int numPizza = Integer.parseInt(pizzaQ.getText().toString());
                    int numJuice = Integer.parseInt(orange_juiceQ.getText().toString());

                    Double priceApple = Double.valueOf(appleP.getText().toString());
                    Double priceHamburger = Double.valueOf(hamburgerP.getText().toString());
                    Double priceBroccoli = Double.valueOf(broccoliP.getText().toString());
                    Double prizePizza = Double.valueOf(pizzaP.getText().toString());
                    Double priceJuice = Double.valueOf(orange_juiceP.getText().toString());

                    Double total = (numApple*priceApple)+(numHamburger*priceHamburger)+(numBroccoli*priceBroccoli)+(numPizza*prizePizza)+(numJuice*priceJuice);
                    Double num_tax = total * 0.01225;

                    tax.setText("Tax - $ " + String.format("%.2f", num_tax));

                    Double num_tax_included_total = total + num_tax;
                    totalWithTax.setText("Total with Tax - $ " + String.format("%.2f", num_tax_included_total));

                }
                else
                {

                    int numApple = Integer.parseInt(appleQ.getText().toString());
                    int numHamburger = Integer.parseInt(hamburgerQ.getText().toString ());
                    int numBroccoli = Integer.parseInt(broccoliQ.getText().toString());
                    int numPizza = Integer.parseInt(pizzaQ.getText().toString());
                    int numJuice = Integer.parseInt(orange_juiceQ.getText().toString());
                    int numOther = Integer.parseInt(otherQ.getText().toString());

                    Double priceApple = Double.valueOf(appleP.getText().toString());
                    Double priceHamburger = Double.valueOf(hamburgerP.getText().toString());
                    Double priceBroccoli = Double.valueOf(broccoliP.getText().toString());
                    Double prizePizza = Double.valueOf(pizzaP.getText().toString());
                    Double priceJuice = Double.valueOf(orange_juiceP.getText().toString());
                    Double priceOther = Double.valueOf(otherP.getText().toString());


                    Double total = (numApple*priceApple)+(numHamburger*priceHamburger)+(numBroccoli*priceBroccoli)+(numPizza*prizePizza)+(numJuice*priceJuice)+(numOther*priceOther);
                    Double num_tax = total * 0.01225;

                    tax.setText("Tax - $ " + String.format("%.2f", num_tax));

                    Double num_tax_included_total = total + num_tax;
                    totalWithTax.setText("Total with tax - $ " + String.format("%.2f", num_tax_included_total));

                }


            }
        });

        /*
        Double billTotal= Double.valueOf(billTotalEditText.getText().toString());
        Double tipTotal = billTotal * 0.2;
        tipTotalTextView.setText("Tip - $ " + tipTotal.toString());
        Double total = billTotal + tipTotal;
        tipIncludedTotalTextView.setText("Total - $ " + total.toString());
        */



        String categoriesName = (String)getIntent().getExtras().get("categoriesName");
        name.setText(categoriesName);

        //populate items/prices
        if (categoriesName.equals("Shop all foods"))
        {
        apple.setText("Apple");
        hamburger.setText("Hamburger");
        broccoli.setText("Broccoli");
        pizza.setText("Pizza");
        orange_juice.setText("Orange Juice");
        appleP.setText("3.50");
        hamburgerP.setText("5.00");
        broccoliP.setText("39.95");
        pizzaP.setText("10.00");
        orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Snacks"))
        {
        apple.setText("Jerky");
        hamburger.setText("Fruit Snacks");
        broccoli.setText("Cookies");
        pizza.setText("Popcorn");
        orange_juice.setText("Pretzel");
        appleP.setText("5.00");
        hamburgerP.setText("15.00");
        broccoliP.setText("5.00");
        pizzaP.setText("4.50");
        orange_juiceP.setText("6.00");

        }
        if (categoriesName.equals("Breakfast & Cereal"))
        {
        apple.setText("Cereal");
        hamburger.setText("Waffle");
        broccoli.setText("Jams");
        pizza.setText("Toaster Pastries");
        orange_juice.setText("Oatmeal");
            appleP.setText("7.00");
            hamburgerP.setText("20.15");
            broccoliP.setText("30.20");
            pizzaP.setText("10.00");
            orange_juiceP.setText("4.99");


        }
        if (categoriesName.equals("Meals"))
        {
        apple.setText("Canned Vegetables");
        hamburger.setText("Pasta and Noodles");
        broccoli.setText("Boxed Meals");
        pizza.setText("Soup");
        orange_juice.setText("Beans");
            appleP.setText("10.00");
            hamburgerP.setText("25.99");
            broccoliP.setText("40.59");
            pizzaP.setText("19.99");
            orange_juiceP.setText("7.00");
        }
        if (categoriesName.equals("Coffee"))
        {
        apple.setText("Apple");
        hamburger.setText("Hamburger");
        broccoli.setText("Broccoli");
        pizza.setText("Pizza");
        orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");
        }
        if (categoriesName.equals("Beverage"))
        {
        apple.setText("Apple");
        hamburger.setText("Hamburger");
        broccoli.setText("Broccoli");
        pizza.setText("Pizza");
        orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");
        }
        if (categoriesName.equals("Candy, Chocolate & Gum"))

        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Premium Chocolate Soup"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Premium Coffee shop"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Plant Based Food"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Gluten Free Foods"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Asian Shop"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");
        }
        if (categoriesName.equals("Baking Center"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Fresh food"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }
        if (categoriesName.equals("Frozen food"))
        {
            apple.setText("Apple");
            hamburger.setText("Hamburger");
            broccoli.setText("Broccoli");
            pizza.setText("Pizza");
            orange_juice.setText("Orange Juice");
            appleP.setText("3.50");
            hamburgerP.setText("5.00");
            broccoliP.setText("39.95");
            pizzaP.setText("10.00");
            orange_juiceP.setText("7.00");

        }

            /*
            "Shop all foods"
            "Snacks"
            "Breakfast & Cereal"
            "Meals"
            "Coffee"
            "Beverages"
            "Candy, Chocolate & Gum"
            "Premium Chocolate Shop"
            "Premium Coffee shop"
            "Plant Based Food"
            "Gluten Free Foods"
            "Asian Shop"
            "Baking Center"
            "Fresh food"
            "Frozen food"
             */
    }
}
