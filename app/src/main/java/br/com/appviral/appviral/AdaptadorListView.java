package br.com.appviral.appviral;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import br.com.appviral.appviral.Entidade.DadosDoPost;

/**
 * Created by Martin on 19/05/2016.
 */
public class AdaptadorListView extends BaseAdapter {

    ArrayList<DadosDoPost> listaDeDados;
    LayoutInflater layoutInflater;
    Context context;

    public AdaptadorListView(Context context){
        this.context = context;
        listaDeDados = new ArrayList<>();
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return listaDeDados.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDeDados.get(position);
    }

    @Override
    public long getItemId(int position) {
        DadosDoPost dadosDoPost = listaDeDados.get(position);
        return Long.valueOf(dadosDoPost.id);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.layout_item_listview, null);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView texto = (TextView) convertView.findViewById(R.id.textView);

        //Povoar
        DadosDoPost post = listaDeDados.get(position);
        texto.setText(post.texto);
        int img = context.getResources().getIdentifier(post.imagemURL,"mipmap",context.getPackageName());
        imageView.setImageResource(img);
        return convertView;
    }











}
