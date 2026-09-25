# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelDeploymentCollection(object):
    """
    Result of searching model deployments.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelDeploymentCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployments:
            The value to assign to the deployments property of this ModelDeploymentCollection.
        :type deployments: list[oci.aidataplatform_dp.models.ModelDeploymentSummary]

        :param next_page_token:
            The value to assign to the next_page_token property of this ModelDeploymentCollection.
        :type next_page_token: str

        """
        self.swagger_types = {
            'deployments': 'list[ModelDeploymentSummary]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'deployments': 'deployments',
            'next_page_token': 'next_page_token'
        }

        self._deployments = None
        self._next_page_token = None

    @property
    def deployments(self):
        """
        **[Required]** Gets the deployments of this ModelDeploymentCollection.
        Deployments that match the search criteria.


        :return: The deployments of this ModelDeploymentCollection.
        :rtype: list[oci.aidataplatform_dp.models.ModelDeploymentSummary]
        """
        return self._deployments

    @deployments.setter
    def deployments(self, deployments):
        """
        Sets the deployments of this ModelDeploymentCollection.
        Deployments that match the search criteria.


        :param deployments: The deployments of this ModelDeploymentCollection.
        :type: list[oci.aidataplatform_dp.models.ModelDeploymentSummary]
        """
        self._deployments = deployments

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this ModelDeploymentCollection.
        Token that can be used to retrieve the next page of deployments. An empty token means that no more deployments are available for retrieval.


        :return: The next_page_token of this ModelDeploymentCollection.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this ModelDeploymentCollection.
        Token that can be used to retrieve the next page of deployments. An empty token means that no more deployments are available for retrieval.


        :param next_page_token: The next_page_token of this ModelDeploymentCollection.
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
