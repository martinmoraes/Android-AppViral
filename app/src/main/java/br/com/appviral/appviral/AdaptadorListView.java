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
        povoaLocal();
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




    public void povoaLocal(){
        listaDeDados.add(new DadosDoPost("10","Uma casa amarela", "ic_casa_amarela"));
        listaDeDados.add(new DadosDoPost("20","Uma casa rocha", "ic_casa_rocha"));
        listaDeDados.add(new DadosDoPost("30","Uma casa verde", "ic_casa_verde"));
        listaDeDados.add(new DadosDoPost("40","Uma homem azul", "ic_homem_azul"));
        listaDeDados.add(new DadosDoPost("50","Uma homem amarelo", "ic_homem_amarelo"));
        listaDeDados.add(new DadosDoPost("60","Uma homem verde", "ic_homem_verde"));
        listaDeDados.add(new DadosDoPost("70","Relógio", "ic_relogio_verde"));
        listaDeDados.add(new DadosDoPost("10","Uma casa amarela", "ic_casa_amarela"));
        listaDeDados.add(new DadosDoPost("20","Uma casa rocha", "ic_casa_rocha"));
        listaDeDados.add(new DadosDoPost("30","Uma casa verde", "ic_casa_verde"));
        listaDeDados.add(new DadosDoPost("40","Uma homem azul", "ic_homem_azul"));
        listaDeDados.add(new DadosDoPost("50","Uma homem amarelo", "ic_homem_amarelo"));
        listaDeDados.add(new DadosDoPost("60","Uma homem verde", "ic_homem_verde"));
        listaDeDados.add(new DadosDoPost("70","Relógio", "ic_relogio_verde"));
        listaDeDados.add(new DadosDoPost("10","Uma casa amarela", "ic_casa_amarela"));
        listaDeDados.add(new DadosDoPost("20","Uma casa rocha", "ic_casa_rocha"));
        listaDeDados.add(new DadosDoPost("30","Uma casa verde", "ic_casa_verde"));
        listaDeDados.add(new DadosDoPost("40","Uma homem azul", "ic_homem_azul"));
        listaDeDados.add(new DadosDoPost("50","Uma homem amarelo", "ic_homem_amarelo"));
        listaDeDados.add(new DadosDoPost("60","Uma homem verde", "ic_homem_verde"));
        listaDeDados.add(new DadosDoPost("70","Relógio", "ic_relogio_verde"));
    }







}
