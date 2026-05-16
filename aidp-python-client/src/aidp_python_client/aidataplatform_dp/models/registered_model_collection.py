# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RegisteredModelCollection(object):
    """
    Result of listing RegisteredModels.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RegisteredModelCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param registered_models:
            The value to assign to the registered_models property of this RegisteredModelCollection.
        :type registered_models: list[oci.aidataplatform_dp.models.RegisteredModel]

        :param next_page_token:
            The value to assign to the next_page_token property of this RegisteredModelCollection.
        :type next_page_token: str

        """
        self.swagger_types = {
            'registered_models': 'list[RegisteredModel]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'registered_models': 'registered_models',
            'next_page_token': 'next_page_token'
        }

        self._registered_models = None
        self._next_page_token = None

    @property
    def registered_models(self):
        """
        **[Required]** Gets the registered_models of this RegisteredModelCollection.
        RegisteredModels that match the search criteria


        :return: The registered_models of this RegisteredModelCollection.
        :rtype: list[oci.aidataplatform_dp.models.RegisteredModel]
        """
        return self._registered_models

    @registered_models.setter
    def registered_models(self, registered_models):
        """
        Sets the registered_models of this RegisteredModelCollection.
        RegisteredModels that match the search criteria


        :param registered_models: The registered_models of this RegisteredModelCollection.
        :type: list[oci.aidataplatform_dp.models.RegisteredModel]
        """
        self._registered_models = registered_models

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this RegisteredModelCollection.
        Token that can be used to retrieve the next page of RegisteredModels.


        :return: The next_page_token of this RegisteredModelCollection.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this RegisteredModelCollection.
        Token that can be used to retrieve the next page of RegisteredModels.


        :param next_page_token: The next_page_token of this RegisteredModelCollection.
        :type: str
        """
        self._next_page_token = next_page_token

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
