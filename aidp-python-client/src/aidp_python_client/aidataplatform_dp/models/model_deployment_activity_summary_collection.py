# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelDeploymentActivitySummaryCollection(object):
    """
    Result of listing deployment activity summaries.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelDeploymentActivitySummaryCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param activities:
            The value to assign to the activities property of this ModelDeploymentActivitySummaryCollection.
        :type activities: list[oci.aidataplatform_dp.models.DeploymentActivitySummary]

        :param next_page_token:
            The value to assign to the next_page_token property of this ModelDeploymentActivitySummaryCollection.
        :type next_page_token: str

        """
        self.swagger_types = {
            'activities': 'list[DeploymentActivitySummary]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'activities': 'activities',
            'next_page_token': 'next_page_token'
        }

        self._activities = None
        self._next_page_token = None

    @property
    def activities(self):
        """
        **[Required]** Gets the activities of this ModelDeploymentActivitySummaryCollection.
        Activity summaries that match the search criteria.


        :return: The activities of this ModelDeploymentActivitySummaryCollection.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentActivitySummary]
        """
        return self._activities

    @activities.setter
    def activities(self, activities):
        """
        Sets the activities of this ModelDeploymentActivitySummaryCollection.
        Activity summaries that match the search criteria.


        :param activities: The activities of this ModelDeploymentActivitySummaryCollection.
        :type: list[oci.aidataplatform_dp.models.DeploymentActivitySummary]
        """
        self._activities = activities

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this ModelDeploymentActivitySummaryCollection.
        Token that can be used to retrieve the next page of activities. An empty token means that no more activities are available for retrieval.


        :return: The next_page_token of this ModelDeploymentActivitySummaryCollection.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this ModelDeploymentActivitySummaryCollection.
        Token that can be used to retrieve the next page of activities. An empty token means that no more activities are available for retrieval.


        :param next_page_token: The next_page_token of this ModelDeploymentActivitySummaryCollection.
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
