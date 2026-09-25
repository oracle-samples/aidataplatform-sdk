# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AnchorColumnLink(object):
    """
    Derived association between a supplied non-anchor column and an anchor column.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AnchorColumnLink object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param scoped_column_id:
            The value to assign to the scoped_column_id property of this AnchorColumnLink.
        :type scoped_column_id: str

        :param anchor_column_id:
            The value to assign to the anchor_column_id property of this AnchorColumnLink.
        :type anchor_column_id: str

        """
        self.swagger_types = {
            'scoped_column_id': 'str',
            'anchor_column_id': 'str'
        }

        self.attribute_map = {
            'scoped_column_id': 'scopedColumnId',
            'anchor_column_id': 'anchorColumnId'
        }

        self._scoped_column_id = None
        self._anchor_column_id = None

    @property
    def scoped_column_id(self):
        """
        **[Required]** Gets the scoped_column_id of this AnchorColumnLink.
        ID of a non-anchor column supplied in nodeColumns.


        :return: The scoped_column_id of this AnchorColumnLink.
        :rtype: str
        """
        return self._scoped_column_id

    @scoped_column_id.setter
    def scoped_column_id(self, scoped_column_id):
        """
        Sets the scoped_column_id of this AnchorColumnLink.
        ID of a non-anchor column supplied in nodeColumns.


        :param scoped_column_id: The scoped_column_id of this AnchorColumnLink.
        :type: str
        """
        self._scoped_column_id = scoped_column_id

    @property
    def anchor_column_id(self):
        """
        **[Required]** Gets the anchor_column_id of this AnchorColumnLink.
        ID of an anchor column connected to the scoped column.


        :return: The anchor_column_id of this AnchorColumnLink.
        :rtype: str
        """
        return self._anchor_column_id

    @anchor_column_id.setter
    def anchor_column_id(self, anchor_column_id):
        """
        Sets the anchor_column_id of this AnchorColumnLink.
        ID of an anchor column connected to the scoped column.


        :param anchor_column_id: The anchor_column_id of this AnchorColumnLink.
        :type: str
        """
        self._anchor_column_id = anchor_column_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
