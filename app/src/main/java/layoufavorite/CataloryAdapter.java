package layoufavorite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemCatalory;

import java.util.List;

public class CataloryAdapter extends RecyclerView.Adapter<CataloryAdapter.ViewHoler> {
    List<Catalory> cataloryList;
    IClickItemCatalory iClickItemCatalory;

    public void CataloryAdapter(List<Catalory> cataloryList, IClickItemCatalory itemCatalory) {
        this.cataloryList = cataloryList;
        this.iClickItemCatalory = itemCatalory;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CataloryAdapter.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.iten_catalory, parent, false);
        ViewHoler viewHoler = new ViewHoler(view);

        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull CataloryAdapter.ViewHoler holder, int position) {
        final Catalory catalory = cataloryList.get(position);

        holder.imgCatalory.setImageResource(catalory.getResourceID());
        holder.name.setText(catalory.getName());
        holder.lnCata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemCatalory.setOnClickItemListener(catalory);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(cataloryList != null){
            return cataloryList.size();
        }
        return 0;
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        private LinearLayout lnCata;
        private ImageView imgCatalory;
        private TextView name;
        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            lnCata = itemView.findViewById(R.id.ln_cata);
            imgCatalory = itemView.findViewById(R.id.img_catalory);
            name = itemView.findViewById(R.id.tv_catalory);
        }
    }
}
