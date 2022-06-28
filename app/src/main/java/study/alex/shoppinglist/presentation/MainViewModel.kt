package study.alex.shoppinglist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import study.alex.shoppinglist.data.ShopListRepositoryImpl
import study.alex.shoppinglist.domain.DeleteShopItemUseCase
import study.alex.shoppinglist.domain.EditShopItemUseCase
import study.alex.shoppinglist.domain.GetShopItemUseCase
import study.alex.shoppinglist.domain.GetShopListUseCase
import study.alex.shoppinglist.domain.ShopItem

class MainViewModel: ViewModel() {

    private  val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private  val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)


    val shopList = getShopListUseCase.getShopList()



    fun deleteShopItem(shopItem:ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)

    }

    fun changeEnableState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)

    }

}




