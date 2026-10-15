# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogPage(object):
    """
    One page of deployment log events.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogPage object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this DeploymentLogPage.
        :type items: list[oci.aidataplatform_dp.models.DeploymentLogSummary]

        :param next_page_token:
            The value to assign to the next_page_token property of this DeploymentLogPage.
        :type next_page_token: str

        """
        self.swagger_types = {
            'items': 'list[DeploymentLogSummary]',
            'next_page_token': 'str'
        }
        self.attribute_map = {
            'items': 'items',
            'next_page_token': 'nextPageToken'
        }
        self._items = None
        self._next_page_token = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this DeploymentLogPage.
        Log events for this page, newest first. May be empty while nextPageToken is set.


        :return: The items of this DeploymentLogPage.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentLogSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this DeploymentLogPage.
        Log events for this page, newest first. May be empty while nextPageToken is set.


        :param items: The items of this DeploymentLogPage.
        :type: list[oci.aidataplatform_dp.models.DeploymentLogSummary]
        """
        self._items = items

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this DeploymentLogPage.
        Continuation token. Absent when the traversal is complete. An empty page with a token means the scan quota ended before matches were found; continue.


        :return: The next_page_token of this DeploymentLogPage.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this DeploymentLogPage.
        Continuation token. Absent when the traversal is complete. An empty page with a token means the scan quota ended before matches were found; continue.


        :param next_page_token: The next_page_token of this DeploymentLogPage.
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
