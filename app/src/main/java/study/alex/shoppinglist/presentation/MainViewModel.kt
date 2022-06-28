package study.alex.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import study.alex.shoppinglist.data.ShopListRepositoryImpl
import study.alex.shoppinglist.domain.DeleteShopItemUseCase
import study.alex.shoppinglist.domain.EditShopItemUseCase
import study.alex.shoppinglist.domain.GetShopItemUseCase

class MainViewModel: ViewModel() {

    private  val repository = ShopListRepositoryImpl

    private val getShopItemUseCase = GetShopItemUseCase(repository)
    private  val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)


}