# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkspaceObjectCollection(object):
    """
    Results of a workspace object list.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new WorkspaceObjectCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this WorkspaceObjectCollection.
        :type items: list[oci.aidataplatform_dp.models.WorkspaceObjectSummary]

        """
        self.swagger_types = {
            'items': 'list[WorkspaceObjectSummary]'
        }

        self.attribute_map = {
            'items': 'items'
        }

        self._items = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this WorkspaceObjectCollection.
        List of workspace objects.


        :return: The items of this WorkspaceObjectCollection.
        :rtype: list[oci.aidataplatform_dp.models.WorkspaceObjectSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this WorkspaceObjectCollection.
        List of workspace objects.


        :param items: The items of this WorkspaceObjectCollection.
        :type: list[oci.aidataplatform_dp.models.WorkspaceObjectSummary]
        """
        self._items = items

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
