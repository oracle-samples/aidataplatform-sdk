# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelVersionCollection(object):
    """
    Result of listing ModelVersions.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelVersionCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_versions:
            The value to assign to the model_versions property of this ModelVersionCollection.
        :type model_versions: list[oci.aidataplatform_dp.models.ModelVersion]

        :param next_page_token:
            The value to assign to the next_page_token property of this ModelVersionCollection.
        :type next_page_token: str

        """
        self.swagger_types = {
            'model_versions': 'list[ModelVersion]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'model_versions': 'model_versions',
            'next_page_token': 'next_page_token'
        }

        self._model_versions = None
        self._next_page_token = None

    @property
    def model_versions(self):
        """
        **[Required]** Gets the model_versions of this ModelVersionCollection.
        ModelVersions that match the search criteria


        :return: The model_versions of this ModelVersionCollection.
        :rtype: list[oci.aidataplatform_dp.models.ModelVersion]
        """
        return self._model_versions

    @model_versions.setter
    def model_versions(self, model_versions):
        """
        Sets the model_versions of this ModelVersionCollection.
        ModelVersions that match the search criteria


        :param model_versions: The model_versions of this ModelVersionCollection.
        :type: list[oci.aidataplatform_dp.models.ModelVersion]
        """
        self._model_versions = model_versions

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this ModelVersionCollection.
        Token that can be used to retrieve the next page of ModelVersions.


        :return: The next_page_token of this ModelVersionCollection.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this ModelVersionCollection.
        Token that can be used to retrieve the next page of ModelVersions.


        :param next_page_token: The next_page_token of this ModelVersionCollection.
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
