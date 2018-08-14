package mx;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import mx.sicar.libtem.R;

public class Temperatura extends Fragment {

    private Button btnUno;
    private EditText edtUno;

    public Temperatura() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_temperatura, container, false);

        btnUno = (Button) view.findViewById(R.id.btnUno);
        edtUno = (EditText) view.findViewById(R.id.edtUno);

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double temperatura = Double.parseDouble(edtUno.getText().toString());
                edtUno.setText(Double.toString((temperatura * 9/5) + 32));
            }
        });


        return view;
    }


}
