# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class HistoryCollection(object):
    """
    Collection of commits for a branch (optionally filtered by folder).
    """

    def __init__(self, **kwargs):
        """
        Initializes a new HistoryCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this HistoryCollection.
        :type items: list[oci.aidataplatform_dp.models.HistorySummary]

        :param git_url:
            The value to assign to the git_url property of this HistoryCollection.
        :type git_url: str

        """
        self.swagger_types = {
            'items': 'list[HistorySummary]',
            'git_url': 'str'
        }

        self.attribute_map = {
            'items': 'items',
            'git_url': 'gitUrl'
        }

        self._items = None
        self._git_url = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this HistoryCollection.
        List of commit summaries.


        :return: The items of this HistoryCollection.
        :rtype: list[oci.aidataplatform_dp.models.HistorySummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this HistoryCollection.
        List of commit summaries.


        :param items: The items of this HistoryCollection.
        :type: list[oci.aidataplatform_dp.models.HistorySummary]
        """
        self._items = items

    @property
    def git_url(self):
        """
        Gets the git_url of this HistoryCollection.
        The git repository url corresponding to the branch


        :return: The git_url of this HistoryCollection.
        :rtype: str
        """
        return self._git_url

    @git_url.setter
    def git_url(self, git_url):
        """
        Sets the git_url of this HistoryCollection.
        The git repository url corresponding to the branch


        :param git_url: The git_url of this HistoryCollection.
        :type: str
        """
        self._git_url = git_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
