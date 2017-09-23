package io.github.erikcaffrey.ayudamexico.common;

import java.util.List;

import erikjhordanrey.base_components.view.BasePresenter;
import erikjhordanrey.base_components.view.BasePresenterLoader;
import io.github.erikcaffrey.ayudamexico.help.model.Help;

/**
 * Created by silmood on 9/22/17.
 */

public interface SimpleListUi<MODEL> extends BasePresenterLoader.Ui {
    void showList(List<MODEL>list);

    void showEmptyMessage();

    void showErrorMessage();

    void showDetails(MODEL item);
}
