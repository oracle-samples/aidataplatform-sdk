# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LoggedModelCollection(object):
    """
    Result of listing logged-models.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LoggedModelCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param models:
            The value to assign to the models property of this LoggedModelCollection.
        :type models: list[oci.aidataplatform_dp.models.LoggedModel]

        :param next_page_token:
            The value to assign to the next_page_token property of this LoggedModelCollection.
        :type next_page_token: str

        """
        self.swagger_types = {
            'models': 'list[LoggedModel]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'models': 'models',
            'next_page_token': 'next_page_token'
        }

        self._models = None
        self._next_page_token = None

    @property
    def models(self):
        """
        Gets the models of this LoggedModelCollection.
        LoggedModels that match the search criteria


        :return: The models of this LoggedModelCollection.
        :rtype: list[oci.aidataplatform_dp.models.LoggedModel]
        """
        return self._models

    @models.setter
    def models(self, models):
        """
        Sets the models of this LoggedModelCollection.
        LoggedModels that match the search criteria


        :param models: The models of this LoggedModelCollection.
        :type: list[oci.aidataplatform_dp.models.LoggedModel]
        """
        self._models = models

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this LoggedModelCollection.
        Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.


        :return: The next_page_token of this LoggedModelCollection.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this LoggedModelCollection.
        Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.


        :param next_page_token: The next_page_token of this LoggedModelCollection.
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
