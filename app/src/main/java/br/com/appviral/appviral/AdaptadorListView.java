package br.com.appviral.appviral;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import br.com.appviral.appviral.Entidade.DadosDoPost;

/**
 * Created by Martin on 19/05/2016.
 */
public class AdaptadorListView extends BaseAdapter {

    ArrayList<DadosDoPost> listaDeDados = new ArrayList<>();


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
        return null;
    }
}
